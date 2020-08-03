package party_basicVersion;

public abstract class People {
    
    abstract String great();

    String getName(String name) {
        return name;
    }

    protected String drink(String drink) {
       return drink + "을 마십니다";
    }

    protected String eat(String food) {
        return food +"을 먹습니다";
    }

    protected boolean hasFork() {
      return false;
    }

    protected void action(String name, String ... item) {
        System.out.println(great());

        if (great().contains("....")) {
            System.out.println("그는 아무말도 없습니다.");
        }
        if (hasFork()) {
            System.out.println(getName(name) +":" + "포크를 가지고 " + eat(item[0]));
        } else{
            System.out.println(getName(name) +":" + eat(item[0]));
        }
        System.out.println(getName(name) +":" + drink(item[1]));
        System.out.println("\n");
    }


}
