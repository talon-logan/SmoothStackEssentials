/*
How many copies of the book titled The Lost Tribe are owned by each library branch?

Response: Returns all books with the specfied title, no books returned from Sharpstown

select lb.branchName, bc.noOfCopies 
from ((tbl_book b NATURAL JOIN tbl_book_copies bc)NATURAL JOIN tbl_library_branch lb)
WHERE b.title ="The Lost Tribe";
*/





/*
Retrieve the names of all borrowers who do not have any books checked out .
Select name from tbl_borrower
WHERE cardNo NOT IN(SELECT cardNo FROM tbl_book_loans);
*/

/*
For each book that is loaned out from the "Sharpstown" branch and whose DueDate is today, 
retrieve the book title, the borrower's name, and the borrower's address.

SELECT B.title, R.Name, R.Address, LB.branchName
FROM tbl_book B, tbl_borrower R , tbl_book_loans BL, tbl_library_branch LB
WHERE LB.BranchId=BL.BranchId AND
BL.dueDate='2018-09-12  %S' AND BL.CardNo=R.CardNo AND BL.BookId= B.bookId;
*/

/*
For each library branch, retrieve the branch name and the total number of books loaned out from that branch.

select lb.branchName, COUNT(*) 
FROM tbl_library_branch lb, tbl_book_loans bl
where bl.branchId = lb.branchId
group by lb.branchName
*/


/*
Retrieve the names, addresses, and number of books checked out for all borrowers who have more than five books checked out

select b.name, b.address, COUNT(*)
from tbl_borrower b, tbl_book_loans bl
WHERE b.cardNo = bl.cardNo
GROUP BY b.cardNo
HAVING COUNT(*)  > 5;

*/


/*
 For each book authored (or co-authored) by "Stephen King", retrieve the title 
 and the number of copies owned by the library branch whose name is "Central"
 
 
select b.title, bc.noOfCopies
FROM (((tbl_author ba NATURAL JOIN tbl_book b) NATURAL JOIN 
tbl_book_copies bc) NATURAL JOIN tbl_library_branch lb )
WHERE ba.authorName ='Stephen King' AND lb.branchName='Central';
*/




