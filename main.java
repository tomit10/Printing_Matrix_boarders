import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int x,y=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Insert the width: ");
		x=reader.nextInt();							//columns 
		System.out.println("Insert the height: ");
		y=reader.nextInt();							//rows
		printMatrix(y,x);							//Call to the function printMatrix
		reader.close();								// Closing Scanner 'reader'
	}
	
	public static void printMatrix(int aX,int aY){
		char [][] matx= new char[aX][aY];

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
        						/**				PRINTING THE MATRIX				**/       
        
        for (int xA = 0; xA <aX; xA++) 
        {
            for (int yA = 0; yA < aY; yA++) 
            {
             
            	System.out.print(matx[xA][yA]);

            }
            System.out.println("");
        }
        
        //--------------------------------DEBUG--------------------------------------
//        for (int xA = 0; xA <aX; xA++) //(int xA = 0; xA < matx.length; xA++)
//        {
//            for (int yA = 0; yA < aY; yA++) //(int yA = 0; yA < matx[xA].length; yA++) 
//            {
//             
//            	System.out.print(xA+""+yA+" ");
//
//            }
//            System.out.println("   ");
//        }
        
	} 

}
