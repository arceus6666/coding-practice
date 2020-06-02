// siempre poner
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

/*
pass array as parameter
// pointer to array
T function(T *arr){...}
// unsized array
T function(T arr[]){...}
*/

template <typename T>

// sort array
// @param {arr} array to sort
// @return sorted array
T *sortArray(T *arr)
{
  int n = sizeof(arr) / sizeof(arr[0]);
  sort(arr, arr + n);
  return arr;
}
