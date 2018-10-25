package com.test.maven3;

import java.lang.reflect.Method;

public class GetMethod {

        public static void main(String[] args) {

            GetMethod cls = new GetMethod();
            Class c = cls.getClass();

            try {
                // parameter type is null
                Method m = c.getMethod("show", null);
                System.out.println("method = " + m.toString());
            }

            catch(NoSuchMethodException e) {
                System.out.println(e.toString());
            }
            try {
                // method Long
                Class[] cArg = new Class[1];
                cArg[0] = Long.class;
                Method lMethod = c.getMethod("showLong", cArg);
                System.out.println("method = " + lMethod.toString());
            }
            catch(NoSuchMethodException e) {
                System.out.println(e.toString());
            }
        }
        public Integer show() {
            return 1;
        }
        public void showLong(Long l) {
            this.l = l;
        }
        long l = 78655;

}
