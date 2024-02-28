package book;

public class Buku {
        private String author;
        private String title;
        private double price;
        private int publisherNumber;
        
        public Buku(String author, String title, double price, int publisherNumber) {
            this.author = author;
            this.title = title;
            this.price = price;
            this.publisherNumber = publisherNumber;
        }
        
        public String getAuthor() {
            return this.author;
        }
        
        public String getTitle() {
            return this.title;
        }
        
        public double getPrice() {
            return this.price;
        }
        
        public int getPublisherNumber() {
            return this.publisherNumber;
        }

        public double calculateBooks(int jumlahBuku){
            return jumlahBuku * this.price;
        }

        public String information1() {
            return '\n' +
                    "author             : " + author + '\n' +
                    "title              : " + title + '\n' +
                    "price              : " + price + '\n' + 
                    "publisherNumber    : " + publisherNumber + '\n';
        }
    }
