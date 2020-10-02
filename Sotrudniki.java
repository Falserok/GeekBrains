public class Sotrudniki {
    private String fio;
    private String doljnost;
    private String email;
    private String tel;
    private double zarplat;
    private int age;

    Sotrudniki(String fio, String post, String email, String tel, double zarplat, int age) {
        this.fio = fio;
        this.doljnost = post;
        this.email = email;
        this.tel = tel;
        this.zarplat = zarplat;
        this.age = age;

    }

    int TakeAge(){
        return age;
    }


    void Show() {
        System.out.println(fio+" "+doljnost+" "+email+" "+tel+" "+zarplat+" "+age);
    }
}