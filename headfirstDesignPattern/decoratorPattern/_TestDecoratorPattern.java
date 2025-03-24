public class _TestDecoratorPattern {
    public static void main(String[] args) {
        Character hero = new BaseCharacter("勇者", 100, 10, 5);
        System.out.println("初始狀態：");
        System.out.println("攻擊力: " + hero.attack());
        System.out.println("血量: " + hero.getHealth());
        System.out.println("防禦: " + hero.getDefense());

        // 加入狂暴 (Berserk)
        hero = new Berserk(hero);
        System.out.println("\n獲得『狂暴』Buff：");
        System.out.println("攻擊力: " + hero.attack());
        System.out.println("血量: " + hero.getHealth());
        System.out.println("防禦: " + hero.getDefense());

        // 再加入犧牲 (Sacrifice)
        hero = new Sacrifice(hero);
        System.out.println("\n獲得『犧牲』Buff：");
        System.out.println("攻擊力: " + hero.attack());
        System.out.println("血量: " + hero.getHealth());
        System.out.println("防禦: " + hero.getDefense());
    }

}
