public class Dog {
            //data variables describing dog
			
            private String name;
			private int age;
			private String breed;

            //default constructor
            public Dog () {
                this.name = "Toby";
                this.age = 1;
                this.breed = "Pomeranian";
            }

            //non default constructor
            public Dog (String name, int age, String breed) {
                this.name = name;
                this.age = age;
                this.breed = breed;
            }
            // SETTERS
            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }

            //getters or mutators
            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public String getBreed() {
                return breed;
            }

			@Override
			public String toString() {
                return name + ", " + age + ", " + breed;

            }			
			
		}//end Dog class
