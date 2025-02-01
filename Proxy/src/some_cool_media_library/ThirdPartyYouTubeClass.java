package some_cool_media_library;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    @Override
    public HashMap<String, Video> popularVideos() {
        connnectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connnectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    //fake methods to simulate network activity - slow as a real life

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connnectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzz", new Video("gbfdvs", "Catzzzz.avi"));
        hmap.put("mtnyjgfb", new Video("mhmgbf", "Dog play with ball.mp4"));
        hmap.put("asdfg", new Video("afsdgvbn", "Dancing video.mpq"));
        hmap.put("vgfrtyfujn", new Video("bdxrftegtgb", "Barcelona vs RealM.mov"));
        hmap.put("erfgfbvchjnm", new Video("kyjghbfsx", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }
}
