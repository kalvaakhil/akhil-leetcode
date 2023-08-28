class Solution:
    def maximumBeauty(self, items: List[List[int]], queries: List[int]) -> List[int]:

                                                    # Ex:      items = [[1,2],[3,2],[2,4],[5,6],[3,5]]
													#        queries = [1,2,3,4,5,6]

        price, beauty = zip(*sorted(items))         # sorted(items = [[1,2],[2,4],[3,2],[3, 5],[5, 6]]
                                                    # price = [1,2,3,3,5], beauty = [2,4,2,5,6]

        beauty = list(accumulate(beauty,lambda x,y: max(x,y)))
		
                                                    # beauty = [2,4,4,5,6]   
        return [0 if q < price[0] else 
                beauty[bisect_right(price, q)-1] for q in queries]
        