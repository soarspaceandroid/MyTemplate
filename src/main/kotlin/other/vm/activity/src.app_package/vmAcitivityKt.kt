
package other.vm.activity.src.app_package

fun vmAcitivityKt(
        applicationPackage:String?,
        activityClass:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}

import android.os.Bundle
import android.view.View
import com.koubeigongzuo.library.base.BaseVMActivity
import ${applicationPackage}.R

class ${activityClass}Activity : BaseVMActivity<${activityClass}ViewModel>() {
    
    override fun getLayoutId(): Int? = R.layout.${layoutName}

    override fun initData(savedInstanceState: Bundle?) {
        
    }

   override fun onClickView(v: View?) {
        super.onClickView(v)
    }
    } 
"""