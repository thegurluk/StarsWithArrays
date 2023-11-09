public class B {
    public static void main(String[] args) {
        String[][] list=new String[5][3];

        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                if(j==0){
                    list[i][j]=" * ";
                } else if ((i==0||i==2||i==4)&&j==1) {
                    list[i][j]=" * ";
                } else if ((i==1||i==2||i==3)&&j==2) {
                    list[i][j]=" * ";
                }else {
                    list[i][j]="   ";
                }
            }
        }

        for(String[] row:list){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
