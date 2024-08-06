public class ArrayOperations {
    
    private int[] arr = {10, 20, 30, 40, 50};


    public void displayArray() {
        System.out.print("Array elements: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    
    public int sumOfElements() {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    
    public double averageOfElements() {
        return (double) sumOfElements() / arr.length;
    }

    
    public int maxElement() {
        int max = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    
    public int minElement() {
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    
    public void reverseArray() {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    public int searchElement(int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations();

        
        arrayOps.displayArray();

        
        System.out.println("Sum of elements: " + arrayOps.sumOfElements());

        
        System.out.println("Average of elements: " + arrayOps.averageOfElements());

        
        System.out.println("Maximum element: " + arrayOps.maxElement());

        
        System.out.println("Minimum element: " + arrayOps.minElement());

        arrayOps.reverseArray();
        System.out.print("Reversed array elements: ");
        arrayOps.displayArray();

        
        int elementToSearch = 30;
        int index = arrayOps.searchElement(elementToSearch);
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }
}