package com.lambdavalue;

public class TestGeneric {

    public static void main(String[] args) {
        GenericsClass<Integer> intobj = new GenericsClass<>(5);
        System.out.println("Generic class return: " + intobj.getData());

        GenericsClass<String> stringobj = new GenericsClass<>("JAVA programming");
        System.out.println("Generic class return " + stringobj.getData());
    }
}

   class GenericsClass<T> {
        private T data;

        public GenericsClass(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

//GEnericsMethods -
/* similear to the genric class we hava also create method that can used with any type of datasuch method is known as generic methods
 * 
 */
