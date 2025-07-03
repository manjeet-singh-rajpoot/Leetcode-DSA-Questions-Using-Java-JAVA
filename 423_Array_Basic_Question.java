public class 423_Array_Basic_Question {
   Java Array Questions with Solutions
Q1: Sum of Two Arrays
int[] arr1 = {1, 2, 3};
int[] arr2 = {4, 5, 6};
int[] sum = new int[arr1.length];
for (int i = 0; i < arr1.length; i++) {
sum[i] = arr1[i] + arr2[i];
}
System.out.print("Sum array: ");
for (int val : sum) {
System.out.print(val + " ");
}
Q2: Compare Two Arrays
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean isEqual = java.util.Arrays.equals(arr1, arr2);
if (isEqual) {
System.out.println("Arrays are equal");
} else {
System.out.println("Arrays are not equal");
}
Q3: Merge Two Arrays
int[] arr1 = {1, 2};
int[] arr2 = {3, 4};
int[] merged = new int[arr1.length + arr2.length];
for (int i = 0; i < arr1.length; i++) {
merged[i] = arr1[i];
}
for (int i = 0; i < arr2.length; i++) {
merged[arr1.length + i] = arr2[i];
}
System.out.print("Merged array: ");
for (int val : merged) {
System.out.print(val + " ");
}
Q4: Common Elements in Two Arrays
int[] arr1 = {1, 2, 3, 4};
int[] arr2 = {3, 4, 5, 6};
System.out.print("Common elements: ");
for (int i = 0; i < arr1.length; i++) {
for (int j = 0; j < arr2.length; j++) {
if (arr1[i] == arr2[j]) {
System.out.print(arr1[i] + " ");
break;
}
}
}
Q5: Unique Elements from Both Arrays
int[] arr1 = {1, 2, 3};
int[] arr2 = {3, 4, 5};
System.out.print("Unique elements: ");
// arr1 elements not in arr2
for (int i = 0; i < arr1.length; i++) {
boolean found = false;
for (int j = 0; j < arr2.length; j++) {
if (arr1[i] == arr2[j]) {
found = true;
break;
}
}
if (!found) {
System.out.print(arr1[i] + " ");
}
}
// arr2 elements not in arr1
for (int i = 0; i < arr2.length; i++) {
boolean found = false;
for (int j = 0; j < arr1.length; j++) {
if (arr2[i] == arr1[j]) {
found = true;
break;
}
}
if (!found) {
System.out.print(arr2[i] + " ");
}
}
Q6: Copy Elements of One Array into Another
int[] arr1 = {5, 10, 15};
int[] arr2 = new int[arr1.length];
for (int i = 0; i < arr1.length; i++) {
arr2[i] = arr1[i];
}
System.out.print("Copied array: ");
for (int val : arr2) {
System.out.print(val + " ");
}
Q7: Find Maximum from Two Arrays
int[] arr1 = {1, 9, 3};
int[] arr2 = {5, 6, 8};
int max = Integer.MIN_VALUE;
for (int val : arr1) {
if (val > max) {
max = val;
}
}
for (int val : arr2) {
if (val > max) {
max = val;
}
}
System.out.println("Maximum element: " + max); 
}
