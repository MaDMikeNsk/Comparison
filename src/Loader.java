public class Loader
{
    public static void main(String[] args)
    {
        Integer dimaAge = 35;
        Integer mishaAge = 55;
        Integer vasyaAge = 18;

        Integer oldest=1;
        Integer youngest=2;
        Integer middle=3;

        //Существует всего 6 вариантов расстановки 3 чисел (M-Misha, D-Dima, V-Vasya) по порядку
        //Проверяем каждый из вариантов

        if (mishaAge>dimaAge && dimaAge>vasyaAge) {oldest = mishaAge; middle = dimaAge; youngest = vasyaAge;} //M D V
        else
        if (mishaAge>vasyaAge && vasyaAge>dimaAge) {oldest = mishaAge; middle = vasyaAge; youngest = dimaAge;} //M V D
        else
        if (dimaAge>mishaAge && mishaAge>vasyaAge) {oldest = dimaAge; middle = mishaAge; youngest = vasyaAge;} //D M V
        else
        if (dimaAge>vasyaAge && vasyaAge>mishaAge) {oldest = dimaAge; middle = vasyaAge; youngest = mishaAge;} //D V M
        else
        if (vasyaAge>mishaAge && mishaAge>dimaAge) {oldest = vasyaAge; middle = mishaAge; youngest = dimaAge;} //V M D
        else
        if (vasyaAge>dimaAge && dimaAge>mishaAge) {oldest = vasyaAge; middle = dimaAge; youngest = mishaAge;} //V D M

        System.out.println("Most old: " + oldest);
        System.out.println("Middle: " + middle);
        System.out.println("Most young: " + youngest);
    }
}
