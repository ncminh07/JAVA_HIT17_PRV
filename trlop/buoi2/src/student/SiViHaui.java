package student;

public class SiViHaui {


        private String name;
        private int age;
        private Car car;

        public SiViHaui(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        void gioithieu() {
            System.out.println("name: " + this.name + " age: " + this.age + " , " + this.car );
        }

    }

