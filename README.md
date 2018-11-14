## Printing Matrix borders

This program will take the width and height as input, and generates a matrix with different types of border. 

I attach some test cases.

![screenshot 2018-11-14 at 07 16 11](https://user-images.githubusercontent.com/16061014/48467671-7f0cc000-e7e1-11e8-99e1-ad8804e703e7.png)

![screenshot 2018-11-14 at 07 15 21](https://user-images.githubusercontent.com/16061014/48467729-ac596e00-e7e1-11e8-8944-380778b004c5.png)

![screenshot 2018-11-14 at 07 14 03](https://user-images.githubusercontent.com/16061014/48467730-ac596e00-e7e1-11e8-9fba-8fca3c5f9726.png)

![screenshot 2018-11-14 at 07 13 48](https://user-images.githubusercontent.com/16061014/48467731-acf20480-e7e1-11e8-8cdc-8946aed2bae3.png)

![screenshot 2018-11-14 at 07 13 34](https://user-images.githubusercontent.com/16061014/48467732-acf20480-e7e1-11e8-8dc7-6e5d4166bc96.png)

![screenshot 2018-11-14 at 07 12 48](https://user-images.githubusercontent.com/16061014/48467734-acf20480-e7e1-11e8-914f-eedc91f4be11.png)

The brief required to print a different type of parentheses, but the ASCII code didn't have the corresponding number. 

The code is divided in two parts, the main, where all the input statement are saved and passed to the second part, the printMatrix function, which will load the two dimensions array with different types of parentheses and print it out. 

        for (int yA = 0; yA < matx.length; yA++)  //for loop row 
        {
            for (int xA = 0; xA < matx[yA].length; xA++) //for loop column 
            {
            	//top-left and bottom-left corners  
            	if((yA==0&&xA==0)||(yA==matx.length-1&&xA==0))
            	{
            		matx[yA][xA]=(char)91;
            	}
            	//top-right and bottom-right corners  
            	else if((yA==0&&xA==matx[yA].length-1)||(yA==matx.length-1&&xA==matx[yA].length-1))
            	{
            		matx[yA][xA]=(char)93;
            	}
            	//Top horizontal border
            	else if(yA==0&&xA!=0&&xA<matx[yA].length-1)
            	{
            		matx[yA][xA]='-';
            	}
            	//Bottom horizontal border
            	else if(yA==matx.length-1&&xA!=0&&xA<matx[yA].length-1)
            	{
            		matx[yA][xA]='-';
            	}
            	//Left and right vertical borders
            	else if(yA!=matx.length-1&&(xA==0||xA==matx[yA].length-1))
            	{
            		matx[yA][xA]=(char)124;
            	}
            	//Empty areas
            	else
                {
                	matx[yA][xA]=' ';
                }
            	
            }
        }
        
 I added a debug code section that can be used to revel the x and y coordinate of each cell.



