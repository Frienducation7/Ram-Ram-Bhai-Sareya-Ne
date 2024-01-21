#include <bits/stdc++.h>
using namespace std;

bool isValid(vector<int> &arr, int pages, int m)
{

    int students = 1, allocated_pages = 0;

    for (auto e : arr)
    {

        allocated_pages += e;

        if (allocated_pages > pages)
        {
            students++;
            allocated_pages = e;
        }

        if (students > m)
        {
            return false;
        }
    }
    return true;
}

int findPages(vector<int> &arr, int n, int m)
{
    // Write your code here.

    if (n < m)
    {
        return -1;
    }

    int low = *max_element(arr.begin(), arr.end());

    int high = 0, ans = -1;

    for (int i = 0; i < n; i++)
    {
        high += arr[i];
    }

    while (low <= high)
    {

        int mid = low + (high - low) / 2;

        if (isValid(arr, mid, m))
        {
            ans = mid;
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }

    return ans;
}