
package other.vm.fragment.src.app_package

fun vmFragmentKt(
        applicationPackage:String?,
        fragmentClass:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}

import android.view.View
import com.koubeigongzuo.library.base.BaseVMFragment
import ${applicationPackage}.R
import android.os.Bundle

class ${fragmentClass}Fragment : BaseVMFragment<${fragmentClass}ViewModel>() {

    override fun getLayoutId(): Int = R.layout.${layoutName}
    
    override fun onLazyInitView(savedInstanceState: Bundle?) {
        super.onLazyInitView(savedInstanceState)
    }
    
    override fun onClickView(v: View?) {
        super.onClickView(v)
    }
    
    } 
"""