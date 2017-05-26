package wjc.seekbar;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

/**
 * Created by Administrator on 2017/5/25 0025.
 */
public class ButtonCustomer extends Button {
    private static final String TAG = ButtonCustomer.class.getName();

    public ButtonCustomer(Context context) {
        super(context);
    }
//
    public ButtonCustomer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ButtonCustomer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG,"defStyleAttr = "+defStyleAttr );

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ButtonCustomer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        Log.d(TAG,"defStyleAttr = "+defStyleAttr +" defStyleRes = "+defStyleRes);
    }
}
