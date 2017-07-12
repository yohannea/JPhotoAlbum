package tests.fi.iki.jka;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import fi.iki.jka.*;
import static org.junit.Assert.assertEquals;

import java.awt.event.ActionEvent;

public class JPhotoFrameTest {
    @Test
    public void testSlideShow() throws Exception {
        int[] intervalBox = new int[1];
        JPhotoFrame jPhotoFrame = new JPhotoFrame()
        {
            public void setTitle() {
            }

            public void saveEdit() {
            }

            protected void slideShow(int interval)
            {
                intervalBox[0] = interval;
            }
        };

        ActionEvent slideshow = new ActionEvent(this, 0, JPhotoMenu.A_SLIDESHOW);
        jPhotoFrame.actionPerformed(slideshow);
        assertEquals(intervalBox[0], jPhotoFrame.A_SLIDESHOW_INTERVAL);

        ActionEvent fSlideshow = new ActionEvent(this, 0, JPhotoMenu.A_FSLIDESHOW);
        jPhotoFrame.actionPerformed(fSlideshow);
        assertEquals(intervalBox[0], jPhotoFrame.A_FSLIDESHOW_INTERVAL);

    }
}