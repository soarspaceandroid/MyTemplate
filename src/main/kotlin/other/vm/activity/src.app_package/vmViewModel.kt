
package other.vm.activity.src.app_package
fun vmViewModel(
        packageName:String,
        activityClass:String
)="""
package ${packageName}
import android.app.Application
import com.koubeigongzuo.library.base.BaseViewModel
import com.koubeigongzuo.library.entity.HttpResult
class ${activityClass}ViewModel(application: Application) : BaseViewModel(application) {
    
    
     override fun showSuccess(response: HttpResult<*>?) {
        super.showSuccess(response)
    }

}    
"""