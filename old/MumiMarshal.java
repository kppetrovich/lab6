public class MumiMarshal extends Mumi {
    boolean timerWasStarted = false;

    @Override
    void specialMove() {
        stamina -= 300;
        hungry -= 10;
        thirst -= 20;
        System.out.print(name + " сделал антену из алюминиевых банок для установки соединения. ");
    }

    {
        name = "Муми-Маршал";
        stamina = 170;
        hungry = 150;
        thirst = 130;
        x = (int) (Math.random() * 100);
        y = (int) (Math.random() * 100);
        z = 1 + (int) (Math.random() * 100);
    }

    Rocket rocket = new Rocket() {
        public void start() {
            power -= 150000;
            System.out.print("Что-то поднимается на горизонте снизу вверх, ");
        }
    };

    void startTheRocket() {
        if (timerWasStarted) {
            rocket.start();
        }
    }

    @Override
    void run() {
        stamina -= 30;
        thirst -= 20;
        hungry -= 15;
        System.out.print("Все солдаты носились ");
    }

    @Override
    public String toString() {
        return "MumiMarshal{}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    void startTimer() {
        if (timerWasStarted == false) {
            Timer timer = new Timer();
            timer.timerIsOn();
            timer.timeIsGo();
        }
    }

    public class Timer {
        int time_left = 600;
        boolean status_timer = false;

        public void timerIsOn() {
            timerWasStarted = true;
            System.out.print("Таймер запущен, ");
        }

        public void timeIsGo() {
            System.out.print("начался обратный отчет, ");
            while (time_left > 0) {
                time_left -= 1;
            }
        }

    }
}