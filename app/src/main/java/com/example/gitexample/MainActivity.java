package com.example.gitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        //入門
        /***查看個人設定 git config --list***/
        //設定全域使用者名稱 git config --global user.name "XXX"
        //設定全域使用者郵件 git config --global user.email "xxx@gmail.com"
        /***憑證快取 git config --global credential.helper cache***/
        /***取得說明 git <verb> --help***/
        /***Git更新(Window) git update-git-for-windows***/
        /***取得git安裝路徑(Window) where git***/
        /***打包成ZIP檔 git archive --format=zip --output=<file_name>.tar HEAD***/
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Git基礎
        //初始化專案 git init
        //追蹤檔案 git add (git add . / git add --all)追蹤所有已有add過的檔案
        //複製遠端專案 git clone https://github.com/aseijuy1995/GitExample.git
        //複製遠端專案並重新命名專案 git clone https://github.com/aseijuy1995/GitExample.git GitProject
        //檢查目前檔案狀態 git status
        /***未追蹤過的檔案 Untracked files***/
        /***等待遞交的更改 Changes to be committed***/
        /***已更改但未增加到暫存區 Changes not staged for commit***/
        //簡潔顯示狀態資訊 git status -s
        //
        //
        //左邊表示已暫存,右邊表示已修改
        //未追蹤過 ??
        //已暫存的新檔案 A_
        //已暫存過的檔案 M_
        //已修改尚未暫存 _M
        //已修改已暫存,並且又有修改過 MM
        //移除檔案 git rm
        //移動檔案 git mv 'file_go' 'file_to'
        //
        //
        //
        //檢視亦暫存和未暫存的變更 git diff
        //檢視與上一次遞交與暫存內容的差異 git diff --staged
        /***檢查遞交前可能存在的空白錯誤 git diff --check***/
        //遞交變更 git commit -m ""
        //跳過暫存區將以修改過的檔案遞交變更 git commit -am ""
        //重設上一次遞交的作者信息 git commit --amend --reset-author
        //顯示分支,合併差異點 git diff <current_branch_name>...<target_branch_name>
        /***取消操作並重新修改commit名 git commit -m "修正commit" --amend***/
        //
        //
        //
        //
        //
        /***取消已暫存的檔案 get reset head <file_name>***/
        /***取消對檔案的修改 git checkout -- <file_name>***/

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Git歷史紀錄
        //檢視遞交歷史 git log
        //檢視遞交歷史並顯示遞交差異 git log -p
        //檢視遞交歷史並簡要統計資訊 git log --stat
        /***檢視遞交歷史並更改輸出格式 git log --pretty=oneline***/
        //git log --pretty=format:"%h - %an, %ar:%s"
        //遞交物件雜湊值 %H
        //遞交物件簡短雜湊值 %h
        //樹物件雜湊值 %T
        //樹物件簡短雜湊值 %t
        //父物件雜湊值 %P
        //父物件簡短雜湊值 %p
        //%an 作者名
        //%ae 作者電子郵件
        //%ad 作者創建日期
        //%cn 遞交者名
        //%ce 遞交者電子郵件
        //%cd 遞交者遞交日期
        //%cr 相對目前日期的遞交日期
        //%s 遞交資訊主題
        /***檢視遞交歷史並更改輸出格式與ASCII顯示基本圖表 git log --pretty=format:"%h %s" --graph***/
        //檢視遞交歷史並顯示更改檔案統計資訊 git log --shortstat
        //檢視遞交歷史並顯示有被更改的檔案 git log --name-only
        //檢視遞交歷史並顯示有被更改的檔案與更改過的統計資訊 git log --name-status
        //檢視遞交歷史並簡短顯示SHA值 git log --abbrev-commit
        //檢視遞交歷史並顯示相對日期 git log --relative-date
        /***檢視遞交歷史並依名查詢相關遞交 git log --author=""***/
        /***檢視遞交歷史並依關鍵字查詢相關遞交 git log --grep=""***/
        /***檢視遞交歷史並依多條件查詢相關遞交 git log --author="" --grep="" --all-match***/
        /***檢視遞交歷史並依增減相關方法的最後一次遞交 git log -S***/
        //檢視遞交歷史並只顯示最新n筆遞交 git log -(n)
        //檢視遞交歷史並指定日期之後的遞交 git log --since --after
        //檢視遞交歷史並指定日期之前的遞交 git log --until --before
        /***檢視遞交歷史並指定相符字串的遞交 git log --committer***/
        /***顯示指向此提交的所有引用(分支,標籤等) git log --decorate***/
        /***顯示欲合併的遞交清單 git log --no-merges <current_branch_name>..<target_branch_name>***/
        //顯示引用內容 git log <target_branch_name> --not <current_branch_name>

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //標籤
        //列舉標記 git tag
        /***註釋標籤 git tag -a <tag_name> -m ""***/
        /***顯示標籤資訊 git show <tag_name>***/
        //輕量標籤 git tag <tag_name>
        //補加標籤 git tab -a <tag_name> SHA-1值
        /***共用標籤 git push origin <tag_name> / git push origin --tags***/
        /***刪除本地標籤 git tag -d <tag_name>***/
        /***刪除遠端標籤 git push origin --delete tag <tag_name>***/
        //顯示最近標籤 git describe <branch_name>
        //簽署標籤
        //為發布版打標籤
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Git分支機制
        //建立分支 git branch <branch_name>
        //刪除分支 git branch -d <branch__name>
        //切換分支 git checkout <branch_name>
        //建立並切換至分支 git checkout -b <branch_name>
        //檢視已合併過的分支 git branch --merged
        //檢視未合併的分支 git branch --no-merged
        /***建立追蹤分支 git checkout -b <branch_name> <remote_name>/<remote_branch_name>***/
        /***建立追蹤分支 git checkout --track <remote_name>/<remote_branch_name>***/
        /***更改遠端追蹤分支 git branch -u <remote_name>/<remote_branch_name>***/
        /***檢視設定的追蹤分支 git branch -vv***/
        /***刪除遠端分支 git push <remote_name> --delete <branch_name>***/
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //合併
        /***接受以合併分支其壓縮成一個變更 git merge --squash <target_branch_name>***/
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //變基
        //基本變基合併 git rebase <target_branch_name>
        //衍生變基合併 git rebase --onto <target_branch_name> <center_branch_name> <current_branch_name>
        //遠端合併使用(merge)會有合併點,若使用(rebase)則直接在遠端分支上繼續往前 git pull rebase
        /***git rebase --continue***/
        /***git rebase --skip***/
        /***git rebase --abort***/
        /***揀選需要的紀錄作為合併主分支中(類似rebase) git cherry-pick <sha-1_value>***/
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Git遠端操作
        //顯示遠端倉庫 git remote
        //顯示遠端倉庫並顯示對應URL git remote -v
        //增加遠端倉庫 git remote add <remote_name> <url>
        //從遠端倉庫取得和擷取資料 git fetch <remote_name> <branch_name>
        //將資料發送到遠端倉庫 git push <remote_name> <branch_name>
        /***檢查遠端倉庫 git remote show <branch_name>***/
        /***重新命名遠端倉庫 git remote rename <old_branch_name> <new_branch_name>***/
        /***刪除遠端倉庫 git remote rm <branch_name>***/
        /***Git別名 git config --global alias.co checkout***/
        //將資料發送到遠端覆蓋當前遠端 git push -f <current_branch_name> <remote_branch_name>
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //擷取請求
        /***衍生別人的專案到自己的Github上 Fork other Project***/
        /***新建分支從主分支(為修改程式碼) Create new branch from master***/
        /***修改程式碼 Modify the code***/
        /***將新分支送回自己的Github上 Push branch to Own Github***/
        /***建立擷取請求 Create pull request***/
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
        
        
        //新建SSH密鑰
        /***前往保存SSH密鑰存放位置 cd ~/.ssh***/
        /***生成SSH密鑰 ssh-keygen***/
        /***取得公鑰 cat ~/.ssh/<ssh_file_name.pub>***/
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //複製當前倉庫(不含工作目錄)建立新的原生倉庫 git clone --bare <remote_url> <custom_name.git>
        //將當前倉庫複製至伺服器目錄 scp -r <custom_name.git> <ssh__url>
        //修改該倉庫目錄的組許可權 git init --bare --shared
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }

    // TODO: 2021/8/15
    // TODO: 2021/8/15 Fix in main2
    // TODO: 2021/8/15 Fix in main2-2
    // TODO: 2021/8/15 master3
    // TODO: 2021/8/15 master4
    // TODO: 2021/8/15 master2
    // TODO: 2021/8/21  
    // TODO: 2021/8/21
    // TODO: 2021/8/21
    // TODO: 2021/8/21  
    // TODO: 2021/8/21to
    //1234567890
    //TAG2
    //Fix
}
