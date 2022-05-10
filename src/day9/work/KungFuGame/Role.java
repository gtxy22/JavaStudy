package day9.work.KungFuGame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyFaces = {"风流俊雅", "器宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌涂地", "面目狰狞"};
    String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "相貌平平", "亭亭玉立", "身材姣好", "相貌简陋", "惨不忍睹"};
//    injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    //    attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setGace(gender);
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setGace(char gender) {
        Random random = new Random();
        if (gender == '男') {
            int index = random.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender =='女') {

            int index = random.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        } else {
            this.face = "惨不忍睹";
        }
    }

    public void showRoleInfo() {
        System.out.println("血量为" + this.getBlood() + "，角色为" + this.getName() +
                "，性别为" + this.getGender() + "，脸型为" + this.getFace());
    }

    //定义一个方法用于攻击敌人
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu,this.getName(),role.getName());
        System.out.println();
        int hurt = r.nextInt(10);
        int remainblood = role.getBlood() - hurt;
        remainblood = remainblood > 0 ? remainblood : 0;
        role.setBlood(remainblood);
        System.out.println(this.getName() + "攻击了" + role.getName() + "，" + role.getName() + "剩余血量" + remainblood);

        //受伤的描述
//        >0 点 0索引的描述
        if (remainblood > 90){
            System.out.printf(injureds_desc[0],role.getName());
        } else if (remainblood > 80 && remainblood <= 90){
            System.out.printf(injureds_desc[1],role.getName());
        }else if (remainblood > 70 && remainblood <= 80){
            System.out.printf(injureds_desc[2],role.getName());
        }else if (remainblood > 690 && remainblood <= 70){
            System.out.printf(injureds_desc[3],role.getName());
        }else if (remainblood > 40 && remainblood <= 60){
            System.out.printf(injureds_desc[4],role.getName());
        }else if (remainblood > 20 && remainblood <= 40){
            System.out.printf(injureds_desc[5],role.getName());
        }else if (remainblood > 10 && remainblood <= 20){
            System.out.printf(injureds_desc[6],role.getName());
        } else {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }
}
