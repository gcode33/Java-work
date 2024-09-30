package Lab10;

    public class Book {
        private String title;

        private double[] price;

        private String ISBN;

        private int[] pages;








        public Book(){
            this("Title Not Avialable", 0.00, "ISBN Not Available", 0);
        }
        public Book(String title,double price,String ISBN,int pages) {
            setTitle(title);
            setPrice(new double[]{price});
            setISBN(ISBN);
            setPages(new int[]{pages});

        }
        public String getTitle() {
            return title;
        }

        public String getISBN() {
            return ISBN;
        }

        public double[] getPrice() {
            return price;
        }

        public int[] getPages() {
            return pages;
        }



        public void setTitle(String title) {
            this.title = title;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }





        public void setPages(int[] pages) {
            for(int i = 0; i< pages.length; i++) {
                if (pages[i] > 0) {                this.pages = pages;
                }
            }
        }

        public void setPrice(double[] price) {
            this.price = price;
        }

        public String toString() {
            return  "Manufacturer: " + getTitle() + "   Price: " + getPrice() + "   ISBN: " + getISBN()
                    + "   pages: " + getPages();
        }
    }



