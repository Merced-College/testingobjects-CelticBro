public class Book {
      //data variables describing book and review score
			
            private String title;
			      private String author;
			      private String score;

            //default constructor
            public Book () {
                this.title = "Foundation";
                this.author = "Isaac Asimov";
                this.breed = "4.5/5";
            }

            //non default constructor
            public Book (String title, String author, String score) {
                this.title = name;
                this.author = author;
                this.score = score;
            }
            // SETTERS
            public void setTitle(String title) {
                this.title = title;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setScore(String score) {
                this.score = score;
            }

            //getters or mutators
            public String getTitle() {
                return title;
            }

            public int getAuthor() {
                return author;
            }

            public String getScore() {
                return score;
            }

			public String toString() {
                return title + ", " + author + ", " + score;

            }			
}
