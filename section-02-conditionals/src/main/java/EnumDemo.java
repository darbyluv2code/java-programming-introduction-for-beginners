public class EnumDemo {

    public static void main(String[] args) {

        ComputerType myComputerType = ComputerType.TABLET;

        String description = switch (myComputerType) {
            case ComputerType.SMARTPHONE -> "Smart phones offer computing power in your hand.";
            case ComputerType.TABLET -> "Tablets are lightweight for browing and light tasks.";
            case ComputerType.LAPTOP -> "Laptops are portable for work on the go.";
            case ComputerType.DESKTOP -> "Desktops excel in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };

        System.out.println(description);
    }
}
