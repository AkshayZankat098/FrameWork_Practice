package org.example.YoutubePages;

import org.junit.Test;

public class RunFile extends BaseTest {

    @Test
    public void testYouTubeOpen() throws InterruptedException {
        YouTubeAutomation youtube = new YouTubeAutomation(driver);
        youtube.openYouTube();
    }
}
