public class SplitStringExample {
    public static void main(String[] args) {
        // Текст для прикладу (можна замінити на ваш текст)
        String text = "Java — об'єктно-орієнтована мова програмування, " +
                "розроблена компанією Sun Microsystems (при підтримці Java Community Process) " +
                "та пізніше придбана компанією Oracle.";

        // Розділити текст на два підрядки рівної довжини
        int middleIndex = text.length() / 2;
        String part1 = text.substring(0, middleIndex);
        String part2 = text.substring(middleIndex);

        // Вивести кожен рядок на екран
        System.out.println("Перший рядок:\n" + part1);
        System.out.println("\nДругий рядок:\n" + part2);
    }
}
