ch=input()
if ( (ch >= 'a' and ch <= 'z') or 
             (ch >= 'A' and ch <= 'Z') ):  
  
            # To handle upper case letters 
            ch = ch.lower() 
  
            if (ch == 'a' or ch == 'e' or ch == 'i' 
                        or ch == 'o' or ch == 'u'):
                    print("Vowel")
                
            else:
                    print("Consonant")


else:
        print("invalid")

