public class Main {
    public static void main(String[] args) {
        /*Обозначение переменных*/
        float start_bal; /*Начальный баланс*/
        float income; /*Сумма пополнения*/
        float bonus; /*Кол-во бонусов*/
        float total_bal; /*Итоговый баланс*/

        /*Первый пример*/
        start_bal=100.72F;
        income=1113;
        if (income>1000) {
            bonus=(int)Math.floor(income/100);}
        else {bonus = 0;}
        System.out.println("Кол-во бонусов");
        System.out.println(bonus);
        total_bal=start_bal+income+bonus;
        System.out.println("Первое пополнение");
        System.out.println(total_bal);
        }
    }
