public class ValidTime {
    int hr;
    int min;
    int sec;
    ValidTime(){
        hr = 1;
        min = 1;
        sec = 1;
    }
    ValidTime(int m, int s, int h){
        min =m;
        sec =s ;
        hr = h;
    }

    boolean valid(){
        if(hr >= 1 && hr<=12){
            if(min >= 0 && min<= 60 ){
                if(sec>= 0 && sec <=60){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }

        }
        else{
            return false;
        }
    }
}
