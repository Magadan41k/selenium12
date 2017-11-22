import static ru.stqa.training.selenium;

public class MyFirstTest {

        private WebDriver driver;
        private WebDriverWait wait;

        @Before
        public void start() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
        }

        @Test
        public  void myFirstTest() {
            driver.get("http://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("webdriver");
            driver.findElement(By.name("btnG")).click;
            wait.until(titleIs("webdriver - Поиск в Google"))
        }

        @After
        public void stop() {
            driver.quit();
            driver = null;
        }
    }
