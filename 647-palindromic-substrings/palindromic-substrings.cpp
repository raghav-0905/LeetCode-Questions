class Solution {
public:

bool isPal(const string &s, int l, int r) {
    while (l < r) {
        if (s[l] != s[r]) return false;
        l++;
        r--;
    }
    return true;
}

int countSubstrings(string s) {
    int count = 0;
    int n = s.size();
    
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {   
            if (isPal(s, i, j)) count++;
        }
    }
    return count;
}



};