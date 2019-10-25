# alertBox
一个支持自定义弹窗的jQuery插件

## 使用说明
- 插件依赖：
1. 此插件依赖于 `jQuery`，因此使用前需要先引入 `jQuery`；
2. 引入 `jQuery` 后，再引入 `alertBox.js`文件；
3. 弹窗样式文件单独书写在 `alertBox.css` 文件中，因此使用时也需要引入`alertBox.css` 文件；
4. 使用方法：通过 `$('body').alertBox({options})` 方法调用，其中`options`为传入的参数（参数格式为对象）  
  示例代码（文件均已引入）：
  ```javascript
      $('#btn').on('click', function () {
        $('body').alertBox({
          title: '领取成功！',
          lTxt: '返回会场',
          lCallback: function(){
            console.log('你点击了返回会场按钮！');
          },
          rTxt: '进入店铺',
          rCallback: function(){
            console.log('你点击了进入店铺按钮！');
          }
        })
      })
  ```
具体示例请查看 [test.html](./test.html)

- 支持自定义属性

下面是弹窗的默认设置：

```javascript
var defaults = {
  zIndex: 99999,  //弹出层定位层级
  title: '',  //标题文字
  lTxt: '',   //左边按钮文字内容
  lBgColor: "#D4D4D4",  //左边按钮背景颜色
  lFontColor: "#333",   //左边按钮文字颜色
  lCallback: function(){},    //左边按钮回调函数
  rTxt: '',   //右边按钮文字内容
  rBgColor: "#ED6465",  //右边按钮背景颜色
  rFontColor: "#fff",   //右边按钮文字颜色
  rCallback: function(){}   //右边按钮回调函数
};
```
属性支持自定义，自定义参数通过alertBox()方法的参数对象传入；传入的自定义的属性会覆盖默认值。

## 关于
目前功能相对单一，后期会逐渐增加功能。。。

