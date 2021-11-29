package corejava;

class RemoveDuplicatesFromString
{
    // abccabbadccd
    // abaadd
    // ab

    static void removeDuplicate(char str[], int length)
    {

        StringBuffer value = new StringBuffer();

        for (int i = 0; i < length - 1; i++)
        {
            if (str[i] == str[i+1])
            {
                i++;
            }else {
                appendValue(value,str[i]);
            }

            if(i == length - 2)
                appendValue(value,str[i+1]);

        }
        System.out.println(value.toString());
    }

    static void appendValue(StringBuffer value, char currChar){

        if(value.length() > 1 && value.charAt(value.length()-1) == currChar)
        {
            value.deleteCharAt(value.length()-1);
        }
        else
        {
            value.append(currChar);
        }

    }

    public static void main(String[] args)
    {
        String info = "abccabbadccd";

        char str[] = info.toCharArray();

        removeDuplicate(str, str.length);
    }
}