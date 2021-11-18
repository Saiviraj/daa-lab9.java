import java.util.Scanner; public class Quick
{

int partition (int a[], int start, int end)
{
int pivot = a[end]; // pivot element int i = (start - 1);

for (int j = start; j <= end - 1; j++)
{
// If current element is smaller than the pivot if (a[j] < pivot)
 
{
i++;
int t = a[i]; a[i] = a[j]; a[j] = t;
}
}
int t = a[i+1]; a[i+1] = a[end]; a[end] = t; return (i + 1);
}

void quick(int a[], int start, int end)
{
if (start < end)
{
int p = partition(a, start, end); //p is partitioning index quick(a, start, p - 1);
quick(a, p + 1, end);
}
}

void printArr(int a[], int n)
{
int i;
for (i = 0; i < n; i++) System.out.print(a[i] + " ");
}
public static void main(String[] args) { Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); int a[]=new int[n]; for(int i=0;i<n;i++) { a[i]=sc.nextInt();
}
System.out.println("\nBefore sorting array elements are - "); Quick q1 = new Quick();
q1.printArr(a, n); q1.quick(a, 0, n - 1);
System.out.println("\nAfter sorting array elements are - "); q1.printArr(a, n);
System.out.println();
}
}
