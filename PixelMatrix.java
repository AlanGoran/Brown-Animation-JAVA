
class PixelMatrix {
	static boolean[][] pixelMatrix = new boolean[400][400];
	
	PixelMatrix(){
		
		int xAxis = 400;
		int yAxis = 400;
		for (int x = 0; x < xAxis; x++){
		  for (int y = 0; y < yAxis; y++)
		     pixelMatrix[x][y] = false;
		}
	}
	
	boolean pixelAvailability(int x,int y){
		if( pixelMatrix[x-1][y] || pixelMatrix[x+1][y] || pixelMatrix[x][y-1] || pixelMatrix[x][y+1] || pixelMatrix[x+1][y+1] || pixelMatrix[x-1][y-1] ||pixelMatrix[x+1][y-1] || pixelMatrix[x-1][y+1])
			return true;
		else
			return false;
	}	
	}

