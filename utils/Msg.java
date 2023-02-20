package utils;

import java.util.Map;
import static java.util.Map.entry;

public class Msg
{
    public static final String welcomeMsg = "Добро пожаловать в зоопарк!\n*Все данные вводить на английском*\n";
    public static final String byeMsg = "Пока!\n";
    public static final String chooseActionsMsg = "Выберите одно из следующих действий:";
    public static final String addAnimalMsg = """
            Вы решили добавить новое животное (посмотрите, какие это могут быть виды)
            1 - Кот
            2 - Собака
            3 - Тигр
            4 - Волк
            5 - Курица
            6 - Аист
            """;

    public static final String askAnimalClassMsg = "Каков его тип? ";
    public static final String askAnimalHeightMsg = "Каков его рост? ";
    public static final String askAnimalWeightMsg = "Каков его вес ";
    public static final String askAnimalEyeColorMsg = "Какой у него цвет глаз? ";
    public static final String askPetNameMsg = "Как его зовут? ";
    public static final String askPetBreedMsg = "Какова его порода? ";
    public static final String askPetVaccinationsMsg = "Какие у него есть прививки (через пробел)? ";
    public static final String askPetFurColorMsg = "Какого цвета у него мех? ";
    public static final String askPetBirthDaterMsg = "Какова его дата рождения (формат гггг-мм-дд)? ";
    public static final String askWildAnimalHabitatMsg = "Каково его место обитания? ";
    public static final String askWildAnimalFoundDateMsg = "Какова его дата нахождения (формат гггг-мм-дд)? ";
    public static final String askBirdFeathersColorMsg = "Какого цвета у него перья? ";
    public static final String askBirdFlightAltitudeMsg = "Какова его высота полета? ";
    public static final String askIsDogTrainedMsg = "Обучена ли собака (ответ y/n)? ";
    public static final String askIsWolfLeaderdMsg = "Является ли волк вожаком (ответ y/n)? ";
    public static final String askIsCatWoollyMsg = "Является ли кошка шерстистой (ответ y/n)? ";

    public static final String getIndexlMsg = "Введите номер: ";
    public static final String getAnimalIDMsg = "Введите ID животного: ";
    public static final String invalidAnimalIDMsg = "Недействительный ID животного";
    public static final String incorrectInputMsg = "Это неверный ответ, попробуйте еще раз!";
    public static final String cannotDoItMsg = "Не могу этого сделать (недопустимый ID животного)";

    public static final String animalWasAddedMsg = "Это животное было добавлено в зоопарк";
    public static final String animalNotAddedMsg = "Это животное не было добавлено в зоопарк";
    public static final String nobodyRemovedMsg = "Никто не был удален из зоопарка (недействительный ID животного)";
    public static final String animalWasRemovedMsg = "Животное было удалено из зоопарка";

    public static final String nobodyLivesInZooMsg = "В зоопарке еще никто не живет";
    public static final String notImplementedMsg = "Это еще не реализовано";

    public static final String cannotFlyMsg = "Животное не может летать... Извините";
    public static final String cannotPetMsg = "Животное нельзя гладить... Извините";
    public static final String cannotTrainMsg = "Животное нельзя дрессировать... Извините";

    public static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новое животное в зоопарк"),
            entry(2, "Удалить животное из зоопарка"),
            entry(3, "Печать информации о конкретном животном"),
            entry(4, "Распечатайте информацию обо всех животных в зоопарке"),
            entry(5, "Издавать звук определенного животного"),
            entry(6, "Издавайте звуки всех животных в зоопарке"),
            entry(7, "Попробуй заставить животное летать"),
            entry(8, "Попробуйте погладить животное"),
            entry(9, "Попробуйте дрессировать животное"),
            entry(0, "Выход из зоопарка"));
}
