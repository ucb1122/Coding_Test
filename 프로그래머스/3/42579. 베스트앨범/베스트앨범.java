import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        HashMap<String, List<Song>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genrePlayCount.merge(genre, play, Integer::sum);
            genreSongs.computeIfAbsent(genre, k -> new ArrayList<>()).add(new Song(i, play));
        }

        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((a, b) -> Integer.compare(genrePlayCount.get(b), genrePlayCount.get(a)));

        List<Integer> answerList = new ArrayList<>();

        for (String genre : sortedGenres) {
            List<Song> songs = genreSongs.get(genre);

            songs.sort((a, b) -> {
                if (a.play == b.play) return Integer.compare(a.id, b.id);
                return Integer.compare(b.play, a.play);
            });

            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answerList.add(songs.get(i).id);
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

    static class Song {
        int id;
        int play;

        Song(int id, int play) {
            this.id = id;
            this.play = play;
        }
    }
}