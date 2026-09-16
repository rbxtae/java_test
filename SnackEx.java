public class SnackEx {
    public static void main(String[] args) {
        PotatoChip chip = new PotatoChip();
        chip.name = "포카칩";
        chip.price = 1500;
        chip.flavor = "어니언";

        System.out.println("=== 감자칩 정보 ===");
        System.out.println("이름: " + chip.name);
        System.out.println("가격: " + chip.price + "원");
        System.out.println("맛: " + chip.flavor);
        chip.eat();

        System.out.println();

        Cookie cookie = new Cookie();
        cookie.name = "칙촉";
        cookie.price = 2000;
        cookie.hasChocolate = true;

        System.out.println("=== 쿠키 정보 ===");
        System.out.println("이름: " + cookie.name);
        System.out.println("가격: " + cookie.price + "원");
        System.out.println("초콜릿 유무: " + cookie.hasChocolate);
        cookie.eat();
    }
}