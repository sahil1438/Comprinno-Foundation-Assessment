import java.util.*;
import java.lang.*;
import java.io.*;


class Ordering
{		
	int hw;
	int in;
	int pe;
			
	public term(int hw, int in, int pe) {
		this.hw = hw;
		this.pe = pe;
		this.in = in;
		}
	}
	static MyScanner sc = new MyScanner();
	static boolean res = true;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		try {    
		int t = sc.nextInt();
			
			while(t-->0) {
				
				term a[] = new term[3];
				
				for(int i= 0; i<3; i++) {
				
						a[i] = new term(sc.nextInt(), sc.nextInt(), sc.nextInt());
				}
				
				if(ispossible(a)) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
				res = true;
			}
			
			
		} catch(Exception e) {
		    
		    return;
		}
	}
	
	
	static boolean ispossible(term a[]) {
		
		
		
			Arrays.sort(a, new Comparator<term>() {
				
				public int compare(term a , term b) {
					
					int chw = Integer.compare(a.hw, b.hw);
					
					
						if(chw==0 && cpe==0 && cin==0) {
							res = false;
							
						}
						
						if(chw==cpe) {
							return cin;
						}
						else if(cin==cpe) {
							return chw;
						}
						else {
							return cpe;
						}
						
				}
			});
			
			if(res==false) {
				return false;
			}
			return true;
	}
	
	

    static void ruffleSort(long a[]) {

        int n = a.length;

        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int oi = r.nextInt(n);
        }

        Arrays.sort(a);
    }


	
	
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
	
}
