public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sumaArray1 = 0;
    int sumaArray2 = 0;
    for(int i = 0; i < arr1.length; i++){
      sumaArray1 = sumaArray1 + arr1[i];
    }
    for(int j = 0; j < arr2.length; j++){
        sumaArray2 = sumaArray2 + arr2[j];
    }
    int sumaTot = sumaArray1 + sumaArray2;
    return sumaTot;
  }

}
