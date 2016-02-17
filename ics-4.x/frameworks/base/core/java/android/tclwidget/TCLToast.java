package android.tclwidget;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class TCLToast extends Toast{
    /**
     * Show the view or text notification for a short period of time.  This time
     * could be user-definable.  This is the default.
     */
    public static final int LENGTH_SHORT = 0;

    /**
     * Show the view or text notification for a long period of time.  This time
     * could be user-definable.
     */
    public static final int LENGTH_LONG = 1;
    /**
     * The TCL_Info image,This is the default
     */
    public static final int INFO_IMAGE = 0;

    /**
     * The TCL_Warning image
     */
    public static final int WARNING_IMAGE = 1;
    /**
     * The TCL_Question image
     */
    public static final int QUESTION_IMAGE = 2;


	public TCLToast(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public static TCLToast makeText(Context context, CharSequence text, int duration){
		
		TCLToast tclToast = new TCLToast(context);
	
		LayoutInflater inflate = (LayoutInflater)
		context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);		
		View v = inflate.inflate(com.android.internal.R.layout.tcl_toast, null);
		TextView tv = (TextView)v.findViewById(com.android.internal.R.id.message);     

		tv.setText(text);      
		tclToast.setView(v);
		tclToast.setDuration(duration);
      
		return tclToast;		
	}
	public static TCLToast makeText(Context context, int textid, int duration){
		
		TCLToast tclToast = new TCLToast(context);
		
		LayoutInflater inflate = (LayoutInflater)
			context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);		
		View v = inflate.inflate(com.android.internal.R.layout.tcl_toast, null);
		TextView tv = (TextView)v.findViewById(com.android.internal.R.id.message);     

		tv.setText(textid);      
		tclToast.setView(v);
		tclToast.setDuration(duration);
      
		return tclToast;		
	}
	
	public static TCLToast makePrompt(Context context, CharSequence text, int imagesrc,int duration){
		TCLToast tclToast = new TCLToast(context);
			
		LayoutInflater inflate = (LayoutInflater)
			context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);	
		View view=inflate.inflate(com.android.internal.R.layout.tcl_toast_img,null);
		ImageView iv= (ImageView)view.findViewById(com.android.internal.R.id.pic);
		if(imagesrc==1){
			iv.setImageResource(com.android.internal.R.drawable.tcl_warning);			
		}
		if(imagesrc==2){
			iv.setImageResource(com.android.internal.R.drawable.tcl_question);			
		}
		if((imagesrc!=0)&&(imagesrc!=1)&&(imagesrc!=2)){
			iv.setImageResource(imagesrc);	
		}

		TextView tv=(TextView)view.findViewById(com.android.internal.R.id.message2);
		tv.setText(text);
		tclToast.setView(view);
		tclToast.setDuration(duration);
		return tclToast;
	}
	public static TCLToast makePrompt(Context context, int textid, int imagesrc,int duration){
		TCLToast tclToast = new TCLToast(context);
		LayoutInflater inflate = (LayoutInflater)
			context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);	
		View view=inflate.inflate(com.android.internal.R.layout.tcl_toast_img,null);
		ImageView iv= (ImageView)view.findViewById(com.android.internal.R.id.pic);
		if(imagesrc==1){
			iv.setImageResource(com.android.internal.R.drawable.tcl_warning);			
		}
		if(imagesrc==2){
			iv.setImageResource(com.android.internal.R.drawable.tcl_question);			
		}
		if((imagesrc!=0)&&(imagesrc!=1)&&(imagesrc!=2)){
			iv.setImageResource(imagesrc);	
		}

		TextView tv=(TextView)view.findViewById(com.android.internal.R.id.message2);
		tv.setText(textid);
		tclToast.setView(view);
		tclToast.setDuration(duration);
		return tclToast;
	}

	public void setAnimationMode(int mode){

	}

}