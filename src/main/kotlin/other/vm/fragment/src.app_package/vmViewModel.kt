
package other.vm.fragment.src.app_package
fun vmViewModel(
        packageName:String,
        fragmentClass:String
)="""
package ${packageName}
import android.app.Application
import com.koubeigongzuo.library.base.BaseViewModel
import com.koubeigongzuo.library.entity.HttpResult
class ${fragmentClass}ViewModel(application: Application) : BaseViewModel(application) {
     
     
     override fun showSuccess(response: HttpResult<*>?) {
        super.showSuccess(response)
    }
}    
"""