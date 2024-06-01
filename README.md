# Crpboy-MIPS

## 说明

本项目仍在开发中。

## 开发环境

scala version: 2.13.8

chisel version: 6.3.0

## 进度

实现了ICache，实现了分支预测。

正在进行vivado转soc-simulator的配置工作。

## 功能测试运行方式

### soc-simulator中运行

推荐开两个控制台，一个用于sbt生成，另一个用于verilator运行功能测试。

```
sbt run
make
```

### vivado testbench中运行

```
sbt run
make submit
```

运行成功后在根目录下的`mycpu_top.v`就是对应的生成文件。

通过修改Makefile中的路径，可以在vivado当中看到提交的`mycpu_top.v`，运行仿真即可。