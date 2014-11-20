package me.mukla.baehandler;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import me.mukla.baehandler.helper.MyExceptionHandler;


public class MainActivity extends ActionBarActivity {

    private MyExceptionHandler mMyExceptionHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMyExceptionHandler = new MyExceptionHandler();
        try {
            testException(5);
            testException(-3);
            testException(15);
        } catch (NullPointerException e) {
            mMyExceptionHandler.handleException(e);
        } catch (NumberFormatException e) {
            mMyExceptionHandler.handleException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            mMyExceptionHandler.handleException(e);
        }

    }

    private void testException(int i) throws NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException {
        if (i < 0) {
            NullPointerException myException = new NullPointerException();
            mMyExceptionHandler.handleException(myException);
        } else if (i > 0 && i < 10) {
            NumberFormatException numberFormatException = new NumberFormatException();
            mMyExceptionHandler.handleException(numberFormatException);
        } else {
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
            mMyExceptionHandler.handleException(arrayIndexOutOfBoundsException);
        }


    }

}
