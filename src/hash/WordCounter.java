package hash;

import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {

    public static void main(String[] args) {
        String article = "Mornings are rough, but Harvard psychologist Amy Cuddy says they can be better if you stay mindful of one behavior." +
                "Before you even put one foot on the floor, stretch your body as wide as possible." +
                "Cuddy is the author of \"Presence: Bringing Your Boldest Self to Your Biggest Challenges,\" a book on the subtle yet powerful ways our posture can influence our thoughts and emotions." +
                "Her TED talk on power posing - how standing like Wonder Woman can build confidence - is the second-most-viewed of all-time." +
                "The thinking behind Cuddy's research is pretty radical." +
                "Typically, we think that our behavior follows our emotions, like when we stand tall and proud because we're feeling confident. Cuddy's research suggests the opposite is also true. We can become more confident simply by striking a power pose - or stretching out in the morning." +
                "At a recent talk at New York's 92Y, Cuddy explained how that wisdom can carry over to your daily routine. Specifically, she mentioned the early-morning power of making yourself huge the moment you open your eyes." +
                "\"It's obviously bi-directional,\" she points out. (In other words, the action might genuinely follow a good feeling.) \"But the people who wake up like this\" - here Cuddy throws her arms up in a V - \"are super happy, like annoyingly happy.\"" +
                "Likewise, you could be doing your emotions a disservice if you wake up curled like a cat." +
                "\"If you sleep in a fetal ball,\" she says, /\"we have some preliminary evidence that people who wake up like that wake up much more stressed out.\"" +
                "Approximately 40% of people sleep in the fetal position, Cuddy says. And it could be making them less confident throughout their day. Now multiply those individual mornings across entire weeks, months, years, and suddenly one annoying morning turns into a lot of unnecessary misery." +
                "Based on Cuddy's research, avoiding that grim reality could be as easy as starting the day on the right foot. Even if you have to fake it at the beginning, chances are it won't be fake for long.";

        System.out.println(counter(article));
    }

    static Map<String, Integer> counter(String article) {
        Map<String, Integer> result = new HashMap<>();
        Map<String, Integer> resultSorted;

        String[] words = article.replaceAll("[\\{\\}\\[\\]\\/?.,;:|\\)*~`!^\\-_+<>@\\#$%&\\\\\\=\\(\\'\\\"]", " ").split("\\s+");
        for (String word : words) result.put(word, result.get(word) == null ? 1 : (Integer) result.get(word) + 1);

        resultSorted = result.entrySet()
                .stream()
                .filter(data -> (data.getValue() > 2))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (u,v) -> { throw new IllegalStateException(String.format("Duplicate key %s", u)); },
                        LinkedHashMap::new
                ));

        return resultSorted;
    }

}
