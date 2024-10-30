int main()
{
     int i, sum = 0;
     for (i=0; i<10; i++) {
         switch(i) {
             case 0: case 1: case 3: case 5: sum++;
             default: continue;
             case 4: break;
         }
     }
}