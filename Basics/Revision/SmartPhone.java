class phone {
    void call() {
        System.out.println("calling people!");
    }

    void sms() {
        System.out.println("sending an sms");
    }
}

interface Camera {
    final static int x = 10;// in interfaces variables are

    void click();

    void record();
}

interface MusicPlayer {
    void play();

    void pause();

    void stop();
}

class SmartPhone extends phone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("clicks a photo!");
    }

    public void record() {
        System.out.println("records video");
    }

    public void play() {
        System.out.println("playing Slimshady");
    }

    public void pause() {
        System.out.println("pausing the music");
    }

    public void stop() {
        System.out.println("stopped playing");
    }

    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.click();
        obj.record();
        obj.play();
        obj.pause();
        obj.stop();
        phone p = (phone) obj;
        /*
         * downcasting the ref of superclass smartphone class obj to the ref of subclass
         * phone p it is imp to extend the sub class phone to the super class smartphone
         */
        p.call();
        p.sms();
        Camera C = obj;
        C.click();
        C.record();
        Camera c = new Camera() {
            public void click() {
                System.out.println("clicking pics of some really hot chicks!");
            }

            public void record() {
                System.out.println("recording some porn videos!");
            }
        };
        c.click();
        c.record();
        MusicPlayer m = new MusicPlayer() {
            public void play() {
                System.out.println("playing some spotify!");
            }

            public void pause() {
                System.out.println("pausing the track!");
            }

            public void stop() {
                System.out.println("stop the damn track!");
            }
        };
        m.play();
        m.pause();
        m.stop();
    }
}