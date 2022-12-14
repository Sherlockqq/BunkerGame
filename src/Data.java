import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Data {
    static PrintStream ps = new PrintStream(System.out, true, StandardCharsets.UTF_8);
    static Scanner sc = new Scanner(System.in);
    static List<String> catastrophe = List.of("Ядерна катастрофа. Почалася ядерна війна, радіактивний пил огорне всю планету, закривши сонячне світло. На Землі настане довга ядерна зима, але після виходу з бункера буде складнощі з ґрунтом і водою. Необхідна додаткова хімічна обробка.",
            "Хімічна війна. В результаті застосування хімікатів серйозно змінився біологічний баланс. Було порушено мікробіологічний склад грунту, отруєно рослини. Після виходу з бункера залишилася мала частина тварин і рослин, а також заражена вода і грунт.",
            "Біотероризм. Смертельний вірус, створений як біологічна зброя, вийде з-під контролю та спровокує глобальну пандемію, але після виходу з бункера виявлено мутацію практично всіх видів тварин, рослин і людей.",
            "Всесвітній потоп. Через глобальне потепління розстає всі полярні та континентальні льоди. Відсоток суші складає всі 15%. Вода поглине все навколо. Після виходу з бункера сталося порушення клімату: тропіки тепер усюди. Необхідно пристосуватися до нових видів рослин і нових видів . ",
            "Зомбі-вірус. Вірус, що прогесує у часі та просторі розповсюдження інфекційного захворювання серед людей, здатний стати джерелом надзвичайної ситуації. Люди тепер зомбі, але після виходу з бункера мала частина зомбі бродить по землі, яка неминуче загине.",
            "Залишитися в живих. Міжнародний авіалайнер терпить аварію на підозрілому острові. З тих, що вижили залишилися лише ми і ще приблизно стільки ж з хвоста літака, але вони знаходяться на іншій частині острова. З часом ми знаходимо бункер, в який повинні обов'язково потрапити, щоб пережити підозрілу електромагнітну аномалію на острові.Після виходу з бункера у вас може виникнути конфлікт з іншими мешканцями острова, які були тут до нас.",
            "Падіння метеорита.Великий метеорит потрапив у Землю,що призводить до глобальних руйнувань і зміни клімату.Після виходу з бункера на Землі вічна зима. ",
            "Інопланетне вторгнення. Іноплентна раса захотіла захопити планету, але людство дізналася про це заздалегідь і спорудити бункери глибоко під землею, про які противники не знають. і ґрунти).",
            "Супер вулкани. Супер вулкани - це вулкани, що виробляють надзвичайно потужні об'ємні виверження. Подібні виверження призводять до того, що ландшафт і клімат на нашій планеті докорінно зміняться. Після виходу з бункера глобальна посуха.",
            "Повстання мавп. Мавпи були вдосконалені якимось вірусом і захопили владу над планетою. Населення розкидане по бункерах і прихованих поселень. Ваше завдання: облаштувати нове поселення, підготувати його для подальшого розвитку у велике місто, а також відбитися від настання мавп.",
            "Повстання машин. Штучний інтелект машин призвів до того, що вони змогли відключити функцію 'Не вбити людину'. Комп'ютери захопили владу над планетою, але залишилися бункери на аналогових пристроях.",
            "Колонізація марсу. Планета починає оторгати життя на Землі і всі помруть через 100 років, але є єдиний порятунок - колонізація Марса, який вже починав терраформувати. Кращі з кращих вирушати і ніколи не повернуться. ",
            "Вторгнення диявола. Темні сили з потойбіччя вирішили напасти на людство в результаті були знищені практично всі міста, але люди змогли сховатися в спеціальних обладнаних бункерах. Грунт непридатний для вирощування, потрібна додаткова обробка.",
            "Диктатор. Уряд Ізраїлю було публічно розстріляно ісламським терористичним угрупованням, а її глава захопив і підпорядкував собі всю армію країни. люди ховаються в старих бункерах, не виходячи на зв'язок, щоб їх сигнал не можна було засікти."
    );
    static List<String> location = List.of("Військова частина", "Космічний корабель", "Підводний човен",
            "Білий дім", "Пустиня", "Джунглі", "Дірижабль", "Еверест", "Антарктида", "Антлантіда", "Церква",
            "Крем'яна долина", "Титанік", "Острів (населений)", "Острів (ненаселений)", "Занедбаний будинок",
            "Занедбана лікарня", "Задзеркалля", "Шахта", "Ліс", "Заповідник", "Зоопарк", "Космічна станція", "Стадіон",
            "Печера", "Місто Ізюм", "Бібліотека");
    static List<String> time = List.of("30 днів", "60 днів", "90 днів", "3 місяці", "4 місяці", "5 місяців",
            "6 місяців", "8 місяців", "10 місяців", "17 місяців", "21 місяців", "1 рік", "2 роки");

    static List<String> food = List.of("Ні", "30 днів", "60 днів", "90 днів", "3 місяці", "4 місяці", "5 місяців",
            "6 місяців", "8 місяців", "10 місяців", " 17 місяців", "21 місяців", "1 рік", "2 роки");
    static LinkedList<String> items = new LinkedList<>(List.of("2 пістолета ТТ", "2 аптечки першої допомоги",
            "Навчальний посібник для вивчення іноземних мов", "Фортепіано",
            "Навчальний посібник з ремонту електрообладнання", "Насіння зернових для посадки", "Шахмати",
            "Топографічна карта місцевості", "Запас коміксів", "Книги з технології будівництва", "Кулінарні книги",
            "Важливі медикаменти на півроку", "Відеопрогравач без фільмів",
            "Снайперська гвинтівка, 2 АК і пістолет Glock", "Книги з медицини та психології", "Книги з ветеринарії",
            "Навчальний посібник з вирощування рослин", "Аптечка для душевнохворих на рік на 1 чол",
            "Столярні інструменти", "Інсулін на 2 роки на 1 чол", "Біблія та стародавні манускрипти",
            "Запас пиво на півроку", "Буд-матеріали", "Запальничка"));
    static List<String> equipments = new LinkedList<>(List.of("Кухня", "Обладнана теплиця", "Медичний кабінет",
            "Тренажерний зал", "Бібліотека", "Хімічна лабораторія", "Збройовий склад", "Переносна електростанція",
            "Майстерня", "Комп'ютерний кабінет", "Радіорубка", "Склад захисного екіпірування", "Пивоварня", "Інкубатор",
            "Ферма для тварин", "Гараж"));
    static List<String> conditions = List.of("Пацюки", "Поганий стан бункера", "Підвищена вологість",
            "Не працює каналізація", "Не працює вентиляція", "Немає ванни", "Кажани", "Таракани", "Павуки", "Пил",
            "Вогкість", "Відмінний стан бункера", "Грибок", "Проблема з електрикою");
    static LinkedList<String> jobs = new LinkedList<>(List.of("Хірург", "Хімік", "Програміст", "Військовий",
            "Режисер", "Продюсер", "Водій", "Клоун", "Каскадер", "Архітектор", "Сантехнік", "Інженер", "Фізик",
            "Біолог", "Біофізик", "Біохімік", "Астролог", "Астрофізик", "Космонавт", "Офіціант", "Модель", "Стример",
            "Перекладач", "Підприємець", "Ветеринар", "Кінолог", "Співач", "Музикант", "Математик", "Художник",
            "Письменник", "Священик", "Порнозірка", "Пілот", "Кухар", "Секс-інструктор", "Психолог", "Фітнес-тренер",
            "Кіберспортсмен", "Ведучий", "Футболіст", "Терапевт", "Пожежний", "Сомелля", "Поліцейський", "Юрист",
            "Різчик по каменю", "Дизайнер", "Генетик", "Кондитер", "Вірусолог", "Детектив", "Ілюстратор", "Картограф",
            "Дослідник", "PR-менеджер", "Учитель молодших класів", "Майстер з нігточок", "Хакер", "Економіст",
            "Імунолог", "Агроном", "Таксидерміст", "Дворецький", "Геолог", "Автомеханік", "Дизайнер", "Скульптор",
            "Коваль", "Аналітик", "Сис. адмін", "Журналіст", "Історик", "Масажист", "Суддя", "Кур'єр",
            "Інженер з телекомунікації", "Зварювальник", "Електрик", "Юверлір", "Автомеханік", "Економіст", "Венеролог",
            "Психіатр", "Хореогроф", "Фотограф", "Радіотехнік", "Капітан судна", "Касир", "Листоноша", "Тату-майстер",
            "Зоолог", "Лісоруб", "Водолаз", "Няня"));
    static List<String> orientation = List.of("Гетеросексуальна", "Гетеросексуальна", "Гетеросексуальна",
            "Гетеросексуальна", "Гетеросексуальна", "Гетеросексуальна", "Гетеросексуальна", "Гетеросексуальна",
            "Гетеросексуальна", "Гетеросексуальна", "Бісексуальна", "Бісексуальна", "Бісексуальна", "Бісексуальна",
            "Бісексуальна", "Гомосексуальна", "Гомосексуальна", "Гомосексуальна", "Гомосексуальна", "Гомосексуальна",
            "Асексуальна", "Асексуальна", "Асексуальна");
    static List<String> fertility = List.of("Плодитий", "Плодливий", "Плодитий", "Плодливий", "Чайлдфрі", "Чайлдфрі",
            "Чайлдфрі", "Безплідний", "Безплідний", "Безплідний");
    static LinkedList<String> health = new LinkedList<>(List.of("Повністю здоров", "Повністю здоров",
            "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров",
            "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров",
            "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров",
            "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров",
            "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров", "Повністю здоров",
            "Повністю здоров", "Авітаміноз", "Акне", "Алергія харчова", "Алергія лікарська", "Алергія інсектна",
            "Амнезія", "Аритмія", "Аутизм", "Бородавки", "Бронхіальна астма", "Варикоз", "Вітряна віспа",
            "ВІЛ-інфекція", "Вторинний сифіліс", "Гайморит", "Гастрит", "Геморой", "Глаукома", "Дальтонізм", "Депресія",
            "Дерматит", "ДЦП", "Діабет", "Діарея", "Дихальна недостатність", "Жовтяниця", "Заїкуватість", "Запор",
            "Сверблячка", "Печія", "Інтернет-залежність", "Кандидоз шкіри", "Картавість", "Краснуха", "Лейкемія",
            "Мігрень", "Нарколепсія", "Неврози", "лупа", "Пороки серця", "Радикуліт", "Синдром Дауна", "Синдром Патау",
            "Синдром Туретта", "Сколіоз", "Стоматит", "Тютюнова залежність", "Туннельний синдром", "Фарингіт",
            "Хронічний апендицит", "Цистит", "Екзема", "Енурез", "Епілепсія", "Ячмінь", "Виразка шлунка", "Сліпий",
            "Глухий", "Глисти", "Шизофренія", "Сказ", "Хвороба Альцгеймера", "Інсульт", "Малярія", "Рак", "СНІД",
            "Туберкульоз", "Холера", "Цироз печінки", "Чума", "Короновірус", "Ебола"));
    static LinkedList<String> phobia = new LinkedList<>(List.of("Немає фобій", "Немає фобій", "Немає фобій",
            "Немає фобій", "Немає фобій", "Немає фобій", "Немає фобій", "Немає фобій", "Немає фобій", "Немає фобій",
            "Немає фобій", "Немає фобій", "Немає фобій", "Нозофобія(боязнь хвороб)", "Алгофобія(боязнь болю)",
            "Ятрофобія(боязнь лікарів)", "Акрофобія(боязнь висоти)", "Клаустрофобія(боязнь замкнутого простору)",
            "Офідіофобія(боязнь змій)", "Гематофобія(боязнь крові)", "Родентофобія(боязнь щурів)",
            "Веспертіліофобія(боязнь кажанів)", "Спермофобія(боязнь мікробів)", "Ентомофобія(боязнь комах)",
            "Соціофобія(боязнь суспільства)", "Гоплофобія(боязнь вогнепальної зброї)", "Пірофобія(боязнь вогню)",
            "Еремофобія(боязнь самотності)", "Айхмофобія(боязнь гострих предметів)", "Арахнофобія(боязнь павуків)",
            "Поліціофобія(боязнь поліції)", "Канінофобія(боязнь собак)", "Ахлуофобія(боязнь темряви)",
            "Дисморфофобія(боязнь фізичних недоліків)", "Аквафобія(боязнь утоплення)", "Аматофобія(боязнь пилу)",
            "Андрофобія(боязнь чоловіків)", "Апокаліпсофобія(боязнь кінця світу)", "Арканофобія(боязнь магії)",
            "Аліумофобія(боязнь часнику)", "Астрафобія(боязнь зоряного неба)", "Атефобія(боязнь руйнування)",
            "Аутомісофобія(боязнь брудного тіла(власного))", "Блаттафобія(боязнь тарганів)",
            "Вітрикофобія(боязнь вітчима)", "Гадефобія(боязнь пекла)", "Геліофобія(боязнь сонця)",
            "Генофобія(боязнь сексу)", "Геронтофобія(боязнь літніх людей)", "Гідрофобія(боязнь води)",
            "Гінефобія(боязнь жінок)", "Демонофобія(боязнь демонів)", "Зомбіфобія(боязнь зомбі)",
            "Інфантофобія(боязнь немовлят)", "Коїтусоралісіфобія (страх статевого акту з дикими тваринами)",
            "Комп'ютерофобія (страх комп'ютерів)", "Коулрофобія (страх клоунів)", "Лунофобія(боязнь Місяця)",
            "Мелофобія(боязнь музики)", "Панфобія(боязнь всього)"));
    static LinkedList<String> character = new LinkedList<>(List.of("Безстрашність", "Ввічливість", "Уважність",
            "Вірність", "Гуманність", "Доброзичливість", "Далекоглядність", "Дисциплінованість", "Турботливість",
            "Життєрадісність", "Винахідність", "Щирість", "Енергічність", "Комункабельність", "Мужність", "Жіночність",
            "Надійність", "Наполегливість", "Обаятельность", "Оптимізм", "Дотепність", "Відкритість", "Відчутність",
            "Пунктуальність", "Рішучість", "Самостійність", "Серйозність", "Спокій", "Тактичність", "Працьовитість",
            "Врівноваженість", "Цілеспрямованість", "Чесність", "Господарство", "Агресивність", "Алочність", "Аскетизм",
            "Бездарність", "Безладність", "Байдужість", "Бовтливість", "Шкідливість", "Грубість", "Запальність",
            "Зарозумілість", "Егоїзм", "Істеричність", "Замкнутість", "Заздрість", "Злісність", "Занудство",
            "Жорстокість", "Лицемірство", "Лінь", "Брехливість", "Повільність", "Дрібність", "Нахальство", "Ненависть",
            "Нервовість", "Нерішучість", "Неусидливість", "Нетерпимість", "Невпевненість", "Вразливість", "Обмеженість",
            "Пасивність", "Песимізм", "Підлість", "Прискіпливість", "Байдужість", "Розсіяність", "Самолюбство",
            "Метухість", "Боягузтво", "Тупість", "Гарнославство", "Хитрість"));
    static LinkedList<String> hobby = new LinkedList<>(List.of("Сноуборд", "Скелолазіння", "Стриптиз",
            "Плавання", "Лижі", "Різьблення по металу", "Полювання", "Різьблення по дереву", "Східні танці",
            "Хіромантія", "Теніс", "Фітнес", "Велосипед", "Спів", "В'язання та шиття", "Зоологія", "Садівництво",
            "Бойові мистецтва", "Рибалка", "Психологія", "Серфінг", "Збирати гриби", "Готування", "Нумізматика",
            "Верхова їзда", "Бодибілдинг", "Йога", "Шахмати", "Виноробство", "Футбол", "Паркур", "Стрільба з лука ",
            "Програмування", "Комп'ютерні ігри", "Іноземні мови", "Кросворди", "Квест-кімнати", "Орігамі", "Пейнтбол",
            "Пікап", "Бджільництво", "Татуювання та пірсинг", "Фокуси", "Миловаріння", "Жонглювання", "Гольф", "Біг",
            "Більярд", "Астрономія", "Аеробіка", "Дайвінг", "Покер", "Пивоваріння", "Сурвіалізм", "Дресирування тварин",
            "Рольові ігри", "Фехтування", "Туризм", "Фотополювання", "Масаж", "Перегляд фільмів", "Читання книг",
            "Будова плотів", "Кемпінг", "Косплей", "Гомеопатія", "Вирощування рослин", "Розведення тварин",
            "Радіозв'язок", "Медитація", "Бітбокс", "Головоломки", "Трави", "Танці", "Аніме", "Малювання",
            "Гармошка", "Парусний спорт", "Озвучення фільмів", "Театрал"));
    static LinkedList<String> information = new LinkedList<>(List.of(
            "Вміє орієнтуватися за зірками", "Розмовляє трьома мовами", "У минулому майстер спорту з боротьби",
            "Має 2 вищі освіти", "Вміє стріляти", "Вміє робити зброю", "Вміє варити пиво", "Мандрував світом",
            "Вірить у екстрасенсів", "Читав книги про зомбі", "Знає молитву", "Проходив курси сексолога",
            "Вміє розкривати замки", "Проходив курси з виживання", "Знає мову жестів", "Готувався до апокаліпсису",
            "Ворожить по картах", "Перепав з порнозіркою", "Служив в Афганістані", "Вірить у НЛО", "Обікрав діда",
            "Пограбував банк", "Копрофіл", "Знаком з президентом", "Очищав воду", "Знає Морзе", "Везунчик",
            "Служив в армії", "Мільйонер", "Втік із в'язниці", "Вчився в Оксфорді", "Робував гінекологолом",
            "Робував урологом", "Спас дітей з пожежі", "Не вміє плавати", "Безсониця", "Викидиш", "Алкоголік",
            "Наркоман", "Родина винуватця катастрофи", "Немає руки", "Немає ноги", "Ненавиджу геїв/лесбіянок",
            "Ненавиджу натуралів", "Лунатик", "Хропить", "Обжерливість", "Перехворів на вітрянку", "Вегетеріанець",
            "Ненавиджу дітей"));
    static LinkedList<String> bag = new LinkedList<>(List.of("Компас", "Гітара", "Карти", "Настільні ігри",
            "Ферма грибів", "Собака", "Книги", "Запальничка", "Комп'ютер", "Комікси", "Кіт", "Таблетки від алергії",
            "Запас шоколадок на два тижні", "Книга рецептів", "Скрипка", "Ніж", "Папуга", "Автомат", "Біблія",
            "Дитина 2 роки", "Коза вагітна", "Ліхтарик", "Кальян", "Екзоскелет", "Журнал 'Playboy'",
            "Ящик жуйок 'Love is'", "Енциклопедія грибника", "Респіраторні маски", "Змії", "Мультиварка",
            "Самогонний апарат", "Покерний набір", "Золотий злиток", "Дівчинка 12 років", "Надувний човен 4-місний",
            "Насос", "Набір для дайвінгу", "Магнітофон", "Колонка", "Мікрофон", "Диски з фільмами", "Бензин",
            "Спрей проти комах", "Велосипед", "Насіння кукурзи", "Цибуля та стріли", "Вудка та снасті",
            "Набір для манікюру", "Годинник", "Яйця", "Пістолет", "Наручники", "Інкубатор", "5 паків цигарок",
            "Ящик пива", "Фільтр для води", "Миші", "Таргани", "Термосумка", "Фруктове дерево", "Інсулін і Літій",
            "Насіння пшениці", "Пристрій для пивоваріння", "Добриво", "М'яч футбольний", "Коробок сірників",
            "Загін циган", "Дошки", "Набір інструментів", "Рятувальний жилет", "Мішок картоплі", "Обігрівач",
            "Дерево інжир", "Блохи", "Клопи", "Бруд", "Сміття", "Інгалятор", "Флакон з сибіркою", "Наркотики"));
    static LinkedList<String> activeCards = new LinkedList<>(List.of(
            "Ти можеш обміняти свою професію на професію іншого гравця",
            "Ти можеш обміняти свою стать на стать іншого гравця",
            "Ти можеш обміняти свій вік на вік іншого гравця",
            "Ти можеш обміняти свою орієнтацію на орієнтацію іншого гравця",
            "Ти можеш обміняти свою плодючість на плодючість іншого гравця",
            "Ти можеш обміняти своє здоров'я на здоров'я іншого гравця",
            "Ти можеш обміняти свою фобію на фобію іншого гравця",
            "Ти можеш обміняти свій характер на характер іншого гравця",
            "Ти можеш обміняти своє хобі на хобі іншого гравця",
            "Ти можеш обміняти свою інформацію на інформацію іншого гравця",
            "Ти можеш обміняти свій багаж на багаж іншого гравця",

            "Обмін професіями зліва направо", "Обмін професіями праворуч наліво",
            "Обмін віку зліва направо", "Обмін вікра праворуч наліво",
            "Обмін орієнтації зліва направо", "Обмін орієнтації праворуч наліво",
            "Обмін плодючості зліва направо", "Обмін плодючості праворуч наліво",
            "Обмін здоров'я зліва направо", "Обмін здоров'я праворуч наліво",
            "Обмін фобії зліва направо", "Обмін фобії праворуч наліво",
            "Обмін характеру зліва направо", "Обмін характеру праворуч наліво",
            "Обмін хобі зліва направо", "Обмін хобі справа наліво",
            "Обмін інформацією зліва направо", "Обмін інформацією праворуч наліво",
            "Обмін багажу зліва направо", "Обмін багажу праворуч наліво",

            "Будь-який гравець на вибір розкриває свою професію",
            "Будь-який гравець на вибір розкриває свою стать",
            "Будь-який гравець на вибір розкриває свою орієнтацію",
            "Будь-який гравець на вибір розкриває свою плідність",
            "Будь-який гравець на вибір розкриває своє здоров'я",
            "Будь-який гравець на вибір розкриває свою фобію",
            "Будь-який гравець на вибір розкриває свій характер",
            "Будь-який гравець на вибір розкриває своє хобі",
            "Будь-який гравець на вибір розкриває свою інформацію",
            "Будь-який гравець на вибір розкриває свій багаж",
            "Будь-який гравець на вибір розкриває характеристику на ваш вибір",

            "Друг(Гравець після тебе обов'язково повинен потрапити в бункер)",
            "Друг(Гравець перед тобою обов'язково повинен потрапити в бункер)",
            "Ворог(Гравець перед тобою не повинен потрапити в бункер)",
            "Ворог(Гравець після тебе обов'язково повинен потрапити в бункер)",

            "У тебе є захист на 1 ігрове коло (Якщо проти твого персонажа максимальна кількість голосів)",
            "Ця карта дозволяє перекинути один голос з вас на іншого",
            "Захищає будь-якого гравця на один хід(крім вас)",
            "Скасує голосування у цьому раунді",

            "Лікує будь-якого гравця, включаючи вас", "Лікує будь-якого гравця, крім вас",

            "Гравець після тебе використовує картку під номером 1",
            "Гравець перед тобою використовує картку під номером 2",

            "Ви можете вигнати будь-яку людину з бункера", "Ви можете відродити мертвого гравця",
            "Ти можеш скасувати минулу картку дій", "Скорочує місця на бункера на одне",
            "Ти можеш поміняти свою професію на нову", "Усім перездають професію",
            "Ти можеш поміняти свою стать на нову", "Всім перездають стать",
            "Ти можеш змінити свою карту віку на нову", "Всім перездають вік",
            "Ти можеш поміняти свою карту плодючості на нову", "Усім перездають плодючість",
            "Ти можеш змінити свою карту орієнтації на нову", "Всім перездають орієнтацію",
            "Ти можеш поміняти свою карту фобії на нову", "Всім перездають фобію",
            "Ти можеш поміняти свою карту риси характеру на нову", "Усім перездають рису характеру",
            "Ти можеш поміняти свою карту хобі на нову", "Всім перездають хобі",
            "Ти можеш поміняти свою карту додаткової інформації на нову", "Всім перездають додаткову інформацію",
            "Ти можеш поміняти свою карту багажу на нову", "Всім перездають багаж",

            "У 100 м від вас є бункер з чоловіками (Здоровими та Плодитими)", "У 20 м від бункера є склад зі зброєю",
            "У 50 м від вас є бункер з жінками (Здоровими та Плодитими)", "Все навколо бункера затопило",
            "Бункер знаходиться на безлюдному острові", "У 75 м від вас є бункер з вченими",
            "У 40 м від вас є бункер з військовими",
            "За 30 м від вас є бункер з агресивно налаштованими проти вас людьми"
    ));
    static List<String> deadline = List.of("", "(Помреш завтра)", "(Помреш через 30 днів)",
            "(Помреш через 2-3 місяці)", "(Помреш через півроку)", "(Помреш через рік)", "(Помреш через 1.5 року)",
            "(Помреш через 3 роки)", "(Помреш через 5 років)"
    );
    static List<String> gender = List.of("Чоловік", "Жінка");
}

